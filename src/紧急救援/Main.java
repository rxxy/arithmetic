package 紧急救援;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	class CityRelation{
		private int dist;
		private int dis;
		
		public CityRelation(int dist, int dis) {
			this.dist = dist;
			this.dis = dis;
		}
		
		public int getDist() {
			return dist;
		}

		public void setDist(int dist) {
			this.dist = dist;
		}

		public int getDis() {
			return dis;
		}
		public void setDis(int dis) {
			this.dis = dis;
		}
		
	}
	
	class City{
		private int id;
		private int jiuyuandui;
		private List<CityRelation> cr;
		
		public City(int id, int jiuyuandui, List<CityRelation> cr) {
			super();
			this.id = id;
			this.jiuyuandui = jiuyuandui;
			this.cr = cr;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getJiuyuandui() {
			return jiuyuandui;
		}
		public void setJiuyuandui(int jiuyuandui) {
			this.jiuyuandui = jiuyuandui;
		}
		public List<CityRelation> getCr() {
			return cr;
		}
		public void setCr(List<CityRelation> cr) {
			this.cr = cr;
		}
		
		
	}
	
	private static List<List<Integer>> pathList = new ArrayList<>();
	//路径长度
	private static List<Integer> pathDis = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();//城市个数
		int m = scanner.nextInt();//快速道路个数
		int s = scanner.nextInt();//开始城市编号
		int d = scanner.nextInt();//结束城市编号
		Main main = new Main();
		ArrayList<City> al = new ArrayList<>();
		
		//每个城市救援队的数目
		for (int i = 0; i < n; i++) {
			al.add(main.new City(i, scanner.nextInt(), null));
		}
		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();//城市1
			int b = scanner.nextInt();//城市2
			int dis = scanner.nextInt();//道路长度
			City city = al.get(a);
			List<CityRelation> cr = city.getCr();
			if (cr == null) {
				cr = new LinkedList<>();
				city.setCr(cr);
			}
			cr.add(main.new CityRelation( b, dis));
			//双向关联
			City city2 = al.get(b);
			List<CityRelation> cr2 = city2.getCr();
			if (cr2 == null) {
				cr2 = new LinkedList<>();
				city2.setCr(cr2);
			}
			cr2.add(main.new CityRelation( a, dis));
		}
		scanner.close();
		
		List<Integer> pathAl = new ArrayList<>();
		search(s, d, al, pathAl, 0);
		
		int shortestPathLength = pathDis.get(0);
		for (Integer dis : pathDis) {
			if (dis < shortestPathLength) {
				shortestPathLength = dis;
			}
		}
		int p = 0;
		for (int i = 0; i < pathDis.size(); i++) {
			if (pathDis.get(i) > shortestPathLength) {
				pathList.remove(i - p);
				p++;
			}
		}
		int jiuyuanduiMax = 0;
		int maxPathIndex = 0;
		int sum = 0;
		for (int i = 0; i < pathList.size(); i++) {
			List<Integer> list = pathList.get(i);
			for (int j = 0; j < list.size(); j++) {
				sum += al.get(list.get(j)).getJiuyuandui();
			}
			if (jiuyuanduiMax == 0) {
				jiuyuanduiMax = sum;
			}else if (sum < jiuyuanduiMax) {
				jiuyuanduiMax = sum;
				maxPathIndex = i;
			}
		}
		System.out.println(pathList.size() + " " + jiuyuanduiMax);
		List<Integer> list = pathList.get(maxPathIndex);
		for (int i = 0; i < list.size(); i++) {
			if (i != 0) {
				System.out.print(" ");
			}
			System.out.print(list.get(i) );
		}
	}

	private static void search(int s, int d, ArrayList<City> al, List<Integer> pathAl, int disSum) {
		pathAl.add(s);
		if (s == d) {
			pathDis.add(disSum);
			pathList.add(pathAl);
			return;
		}
		for (City city : al) {
			if (city.getId() == s) {
				//找到起始点
				List<CityRelation> crList = city.getCr();
				if (crList == null) {
					//没路可走了
					return;
				}
				for (CityRelation cr : crList) {
					int dist = cr.getDist();
					if (!pathAl.contains(dist)) {
						//没走过这条
						if (dist == d) {
							//到达目的地
							pathAl.add(d);
							pathDis.add(disSum + cr.getDis());
							pathList.add(pathAl);
							return;
						}
						//拷贝
						List<Integer> newPathAl = new ArrayList<Integer>();
						newPathAl.addAll(pathAl);
						search(dist, d, al, newPathAl, cr.getDis() + disSum);
					}
				}
			}
		}
		
		
		
	}
	
	
	

}
