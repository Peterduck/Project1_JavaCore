package CustomerInformation;

public class Customer extends Human {
    private static String customerName; //khởi tạo hạn chế truy cập 
    // Sử dụng tính đóng gói encapsulation để lấy-chỉnh sửa thông tin private
    public String getCustomerName(){
        return customerName; // return để đưa giá trị lên trả về giá trị biến customerName
    }
    public void setCustomerName(String newName){
        this.customerName = newName; // this để gán giá trị từ tham số newName vào chính customerName
    }
    private static int totalPrice;
    public int getTotalPrice(){
        return totalPrice;
    }
    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }
    // @Override
    // public void Human(String name, int age, int yearOfBirth, String address, String customerName,int totalPrice){
    //     this.customerName = customerName;
    //     this.totalPrice = totalPrice;
    // }
}
