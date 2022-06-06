import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        int chon ;
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/Movie","root","");
                Statement sttm = conn.createStatement();
        ){
            conn.setAutoCommit(false);
            do {


                Scanner scanner = new Scanner(System.in);
                System.out.print("1.Them \n2.Sua \n3.Xoa \n4.Tim Kiem \n5.Khong \nVui long lua chon:");
                chon = scanner.nextInt();

                if (chon==1){
                    System.out.println("BAN DA CHON THEM. ");
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Nhap Ma Phim:");
                    String maphim =scanner1.nextLine();
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Nhap Ten Phim:");
                    String tenphim =scanner2.nextLine();
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.print("Nhap Ten Dao Dien:");
                    String tendaodien =scanner3.nextLine();
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.print("Nhap Thoi Gian Chieu:");
                    String timechieu =scanner4.nextLine();
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.print("Nhap Thoi Luong Phim:");
                    Integer  timephim =scanner5.nextInt();
                    sttm.executeUpdate("insert into qlMovie values ('"+maphim+"','"+tenphim+"','"+tendaodien+"','"+timechieu+"',"+timephim+");");
                    conn.commit();
                    System.out.println("BAN DA THEM THANH CONG!");
                    ResultSet rset=sttm.executeQuery("select * from qlMovie");
                    while (rset.next()) {
                        System.out.println(rset.getString("maMovie") + ", "
                                + rset.getString("nameMovie") + ", "
                                + rset.getString("nameDirector")+", "
                                + rset.getDate("datePremiere")+", "
                                + rset.getInt("timeMovie")
                        );
                    }
                }
                if (chon==2){
                    System.out.println("BAN DA CHON SUA!");
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Nhap Ma Phim:");
                    String maphim =scanner1.nextLine();
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Nhap Ten Phim:");
                    String tenphim =scanner2.nextLine();
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.print("Nhap Ten Dao Dien:");
                    String tendaodien =scanner3.nextLine();
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.print("Nhap Thoi Gian Chieu:");
                    String timechieu =scanner4.nextLine();
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.print("Nhap Thoi Luong Cua Phim:");
                    Integer  timephim =scanner5.nextInt();
                    sttm.executeUpdate("update qlMovie set nameMovie="+tenphim+",nameDirector="+tendaodien+",datePremiere="+timechieu+",timeMovie="+timephim+" where maMovie="+maphim);
                    conn.commit();
                    System.out.println("BAN DA SUA THANH CONG!");
                    ResultSet rset=sttm.executeQuery("select * from qlMovie");
                    while (rset.next()) {
                        System.out.println(rset.getString("maMovie") + ", "
                                + rset.getString("nameMovie") + ", "
                                + rset.getString("nameDirector")+", "
                                + rset.getDate("datePremiere")+", "
                                + rset.getInt("timeMovie")
                        );
                    }
                }
                if (chon==3){
                    System.out.println("BAN DA CHON XOA!");
                    Scanner scanner1 =new Scanner(System.in);
                    System.out.print("Nhap Ma Phim Ban Can Xoa:");
                    String maPhim = scanner1.nextLine();
                    sttm.executeUpdate("Delete from qlMovie where maMovie="+maPhim);
                    conn.commit();
                    System.out.println("Ban da xoa thanh cong.");
                    ResultSet rset=sttm.executeQuery("select * from qlMovie");
                    while (rset.next()) {
                        System.out.println(rset.getString("maMovie") + ", "
                                + rset.getString("nameMovie") + ", "
                                + rset.getString("nameDirector")+", "
                                + rset.getDate("datePremiere")+", "
                                + rset.getInt("timeMovie")
                        );
                    }
                }
                if (chon==4){
                    System.out.println("BAN DA CHON TIM KIEM!");
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Nhap Ma Phim Ban Can Tim:");
                    String maphim =scanner1.nextLine();

                    ResultSet rset=sttm.executeQuery("select * from qlMovie where maMovie='"+maphim+"'");
                    while (rset.next()) {
                        System.out.println(rset.getString("maMovie") + ", "
                                + rset.getString("nameMovie") + ", "
                                + rset.getString("nameDirector")+", "
                                + rset.getDate("datePremiere")+", "
                                + rset.getInt("timeMovie")
                        );
                    }
                }
                if (chon==5){
                    System.out.println("Ban khong chon muc nao.");
                }
            }while (chon!=1&&chon==2&&chon==3&&chon!=4&&chon!=5);

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}