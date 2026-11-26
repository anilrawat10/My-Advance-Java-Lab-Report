public class TestStudentBean {
    public static void main(String[] args) {
        StudentBean bean = new StudentBean();
        bean.setName("John Doe");
        System.out.println("Name: " + bean.getName());

        bean.setAge(23);
        System.out.println("Age: " + bean.getAge());

        bean.setAddress("Basundhara, Kathmandu");
        System.out.println();

        System.out.println("Our College Name is :" + bean.getCollegeName());

    }
    
}
