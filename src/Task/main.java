package Task;

public class main {
    public static void main(String[] args) {

    FileHandler a = new FileHandler("/home/digital32746/HMRC/Training/Java/src/Task/taskTest.txt");
    System.out.println(a.Lines);
    System.out.println(a.getNumberofLines());

}
}
