package service;

import entity.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserService {

    ArrayList<User> userList = new ArrayList<>();

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void inputInfoUser (){
        startReadFileUser();
        User user = new User();
        registerAccount(user);
        user.setIdUser(nextId());
        user.inputUser();
        userList.add(user);
        writeFileUser(userList);
        System.out.println(userList);
    }


    private boolean checkAccountName(String accountName) {
        startReadFileUser();
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getAccountName().equals(accountName)){
                return false;
            }
        }
        return true;
    }

//    private boolean checkEmail(String email) {
//        startReadFileUser();
//        for (int i = 0; i < userList.size(); i++) {
//            if (userList.get(i).getEmail().equals(email)){
//                return false;
//            }
//        }
//        return true;
//    }



    public User isValidUser(String userName, String password) {
        startReadFileUser();
        User user = null;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getAccountName().equals(userName) && userList.get(i).getPassword().equals(password)){
                user = userList.get(i);
            }
        }
        return user;
    }

    public void writeFileUser(List<User>userList){
        try {
            ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream("account.data"));
            writeFile.writeObject(userList);
            writeFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<User> readFileUser()  {
        ObjectInputStream readFile = null;
        try {
            readFile = new ObjectInputStream(new FileInputStream("account.data"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            return (List<User>) readFile.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void startReadFileUser() {
        File file = new File("account.data");
        if (file.exists()){
            userList = (ArrayList<User>) readFileUser();
        }
    }


    public User findByName() {
        startReadFileUser();
        System.out.println("Nhập tên khách hàng mà bạn muốn tìm kiếm");
        String nameUser;
        while (true) {
            nameUser = new Scanner(System.in).nextLine();
            for (int i = 0; i < userList.size(); i++) {
                if (userList.get(i).getUsername() == nameUser){
                    System.out.println("ID: "+userList.get(i).getIdUser());
                    System.out.println("Tên: "+userList.get(i).getUsername());
                    System.out.println("Tuổi: "+userList.get(i).getAge());
                    System.out.println("Địa chỉ: "+userList.get(i).getAddress());
                    System.out.println("Số điện thoại: "+userList.get(i).getPhone());
                }
                System.out.println("Tên khách hàng không tồn tại. Vui lòng nhập lại");
            }
        }
    }

    public User findById() {
        startReadFileUser();
        System.out.println("Nhập ID khách hàng mà bạn muốn tìm kiếm");
        int idUser;
        while (true) {
            idUser = Integer.parseInt(new Scanner(System.in).nextLine());
            for (int i = 0; i < userList.size(); i++) {
                if (userList.get(i).getIdUser() == idUser){
                    System.out.println("ID: "+userList.get(i).getIdUser());
                    System.out.println("Tên: "+userList.get(i).getUsername());
                    System.out.println("Tuổi: "+userList.get(i).getAge());
                    System.out.println("Địa chỉ: "+userList.get(i).getAddress());
                    System.out.println("Số điện thoại: "+userList.get(i).getPhone());
                }
                System.out.println("ID không tồn tại");
            }
        }
    }

    public void registerAccount(User user) {
        System.out.print("Nhập tên đăng nhập của bạn: ");
        String accountName;
        do {
            accountName = new Scanner(System.in).nextLine();
            if (userList.isEmpty()){
                user.setAccountName(accountName);
                break;
            }
            if (checkAccountName(accountName)){
                user.setAccountName(accountName);
                break;
            }
            System.out.println("Tài khoản đã tồn tại. Vui lòng nhập lại tên tài khoản");
        }while (true);
//            System.out.println("Nhập email của bạn:");
//            String email;
//            do {
//                email = new Scanner(System.in).nextLine();
//                if (userList.isEmpty()){
//                    user.setEmail(email);
//                    break;
//                }
//                if (checkEmail(email)){
//                    user.setEmail(email);
//                    break;
//                }
//                System.out.println("Email đã tồn tại. Vui lòng nhập lại email!");
//            }while (true);
        do {
            System.out.print("Nhập mật khẩu của bạn: ");
            String password =new Scanner(System.in).nextLine();
            System.out.print("Nhập lại mật khẩu của bạn: ");
            String retypePassword =new Scanner(System.in).nextLine();
            if (password.compareTo(retypePassword)==0){
                user.setPassword(password);
                break;
            }
            System.out.println("Mật khẩu không khớp vui lòng nhập lại");
        }while (true);
    }

    public void changePassword() {
        String name;
        String passwordOld;
        String passwordNew;
        String passwordNew1;
        do {
            System.out.println("Nhập tên đăng nhập ");
            name = new Scanner(System.in).nextLine();
            System.out.println("Nhập mật khẩu cũ ");
            passwordOld = new Scanner(System.in).nextLine();
            System.out.println("Nhập mật khẩu mới");
            passwordNew = new Scanner(System.in).nextLine();
            System.out.println("Nhập lại mật khẩu mới");
            passwordNew1 = new Scanner(System.in).nextLine();
            for (int i = 0; i < userList.size(); i++) {
                if (userList.get(i).getAccountName().equals(name)) {
                    if ((userList.get(i).getPassword().equals(passwordOld) && passwordNew.equals(passwordNew1))) {
                        userList.get(i).setPassword(passwordNew);
                        writeFileUser(userList);
                        System.out.println("Đổi Mật khẩu Thành công");
                        break;
                    }
                }
                if (!userList.get(i).getAccountName().equals(name)) {
                    System.out.println("Không có tên đăng nhập nào như trên");
                }
            }
        } while (true);
    }

//    public boolean passwordValidator(String password) {
//        if (password.length() >= 7 && password.length() <= 15) {
//            int countChar = 0, countCharSpecical = 0;
//            for (int i = 0; i < password.length(); i++) {
//                if (Character.isUpperCase(password.charAt(i)))
//                    countChar++;
//                if (!Character.isLetterOrDigit(password.charAt(i)) && !Character.isWhitespace(password.charAt(i)))
//                    countCharSpecical++;
//            }
//            return countChar > 0 && countCharSpecical > 0;
//        } else
//            return false;
//    }

//    public boolean emailValidator(String email) {
//        String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
//        Pattern pattern = Pattern.compile(EMAIL_REGEX);
//
//        return pattern.matcher(email).matches();
//    }

    public void forgotPass() {
        startReadFileUser();
        String email;
        String newPassword1;
        String newPassword2;
//        do {
            System.out.println("Nhập email: ");
            email = new Scanner(System.in).nextLine();
            for (int i = 0; i < userList.size(); i++) {
                if (userList.get(i).getEmail().equals(email)) {
                    System.out.println("Nhập mật khẩu mới: ");
                    newPassword1 = new Scanner(System.in).nextLine();
                    System.out.println("Nhập lại mật khẩu mới: ");
                    newPassword2 = new Scanner(System.in).nextLine();
                    if (newPassword2.equals(newPassword1)){
                        userList.get(i).setPassword(newPassword1);
                        writeFileUser(userList);
                        System.out.println("Đổi mật khẩu thành công!");
                        break;
                    }
                }
            }
                System.out.println("Email không đúng. Chưa tồn tại tài khoản.");
//        }while (true);
    }

    public int nextId(){
        startReadFileUser();
        int a = 1;
        for (int i = 1; i <999999 ; i++) {
            int count = 0;
            for (User user : userList) {
                if (i == user.getIdUser()) {
                    count++;
                    break;
                }
            }
            if (count == 0){
                a=i;
                break;
            }
        }
        return a;
    }

}
