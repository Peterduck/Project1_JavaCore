package CustomerInformation; // sử dụng java package 
public class Human{
    String humanName;
    int age;
    int yearOfBirth;
    String address;
    // Tạo thêm con chỉ constructor để 
    public Human(){ //Constructor không có tham số
        humanName = "Human";
        age = 0;
        yearOfBirth = 2023;
        address = "Số nhà/Đường/Quận/Thành phố";
    }
    //Constructor có tham số
    public Human(String name, int age, int yearOfBirth, String address){
        humanName =name; //không cần dùng con trỏ this vì tên hai biến khác nhau
        this.age = age;  //Dùng this thể hiện giá trị tham số age trong phương thức được gán vào giá trị biến được định nghĩa trong class
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }
}