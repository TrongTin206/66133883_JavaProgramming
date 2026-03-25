import java.util.ArrayList;
public class XuLyDanhSach {
	private ArrayList<Integer> list = new ArrayList<>();

    public void them(int x){
        list.add(x);
    }

    public void hienThi(){
        System.out.println(list);
    }

    public void xoaTrung(){
        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
    }

    public void soLonThu2(){
        int max = list.get(0);
        int max2 = list.get(0);

        for(int x : list){
            if(x > max){
                max2 = max;
                max = x;
            }else if(x > max2 && x != max){
                max2 = x;
            }
        }
        System.out.println("So lon thu 2: " + max2);
    }

    public void trungBinhChan(){
        int tong = 0, dem = 0;

        for(int x : list){
            if(x % 2 == 0){
                tong += x;
                dem++;
            }
        }

        if(dem > 0)
            System.out.println("TBC chan: " + (double)tong/dem);
        else
            System.out.println("Khong co so chan");
    }

    public void tachChanLe(){
        ArrayList<Integer> chan = new ArrayList<>();
        ArrayList<Integer> le = new ArrayList<>();

        for(int x : list){
            if(x % 2 == 0) chan.add(x);
            else le.add(x);
        }

        System.out.println("Chan: " + chan);
        System.out.println("Le: " + le);
    }

    public void daoNguoc(){
        ArrayList<Integer> dao = new ArrayList<>();

        for(int i = list.size()-1; i >= 0; i--){
            dao.add(list.get(i));
        }

        System.out.println("Dao nguoc: " + dao);
    }
}
