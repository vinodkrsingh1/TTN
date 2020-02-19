package JAVA2;

interface Furniture{
    void stresstest();
    void firetest();
}
class Woodenchair implements Furniture{
    @Override
    public void firetest() {

        System.out.println("fire test failed for woodenchair");
    }

    @Override
    public void stresstest() {
        System.out.println("stress test passed for woodenchair");
    }
}
class Woodentable implements Furniture{
    @Override
    public void stresstest() {
        System.out.println("stress test passed for woodenchair");
    }

    @Override
    public void firetest() {
        System.out.println("fire test failed for woodenchair");
    }
}
class MetalChair implements Furniture {
    @Override
    public void firetest() {
        System.out.println("fire test passed for metal chair");
    }

    @Override
    public void stresstest() {
        System.out.println("stress test failed for metal chair");
    }
}
class MetalTable implements Furniture{

    @Override
    public void stresstest() {
        System.out.println("stress test failed for metal chair");
    }

    @Override
    public void firetest() {
        System.out.println("fire test passed for metal chair");
    }
}

public class Que9 {
    public static void main(String[] args) {
        Woodenchair wc=new Woodenchair();
        wc.firetest();
        wc.stresstest();

        Woodentable wt=new Woodentable();
        wt.firetest();

        wt.stresstest();


        MetalChair mc=new MetalChair();
        mc.firetest();
        mc.stresstest();

        MetalTable mt=new MetalTable();

        mt.firetest();
        mt.stresstest();
    }
}