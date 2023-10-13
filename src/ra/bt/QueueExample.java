package ra.bt;

import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {public static void main(String[] args) {
    LinkedList<String> danhSachDauVao = new LinkedList<>();
    danhSachDauVao.add("Phần tử 1");
    danhSachDauVao.add("Phần tử 2");
    danhSachDauVao.add("Phần tử 3");
    danhSachDauVao.add("Phần tử 4");
    danhSachDauVao.add("Phần tử 5");

    Queue<String> hangDoi = new LinkedList<>();

    hangDoi.addAll(danhSachDauVao);

    System.out.println("Các phần tử trong hàng đợi:");
    while (!hangDoi.isEmpty()) {
        String phanTu = hangDoi.poll();
        System.out.println(phanTu);
    }
}
}