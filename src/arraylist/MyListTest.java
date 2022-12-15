package arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<Integer>(); //Khởi tạo đối tượng mảng listInterger với kiểu dữ liệu MyList<integer>
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(3);
        listInterger.add(4);
        System.out.println("element 0: "+ listInterger.get(0));

//        listInterger.get(6);
//        System.out.println("element 6: "+ listInterger.get(6));

//        listInteger.get(-1);
//        System.out.println("element -1: " + listInteger.get(-1));
    }
}
