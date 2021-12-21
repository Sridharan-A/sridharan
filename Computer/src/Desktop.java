public class Desktop implements Hardware,Software{
    @Override
    public void hardwareResources() {
        System.out.println("Hardware Resource:1TB");
    }

    @Override
    public void softwareResources() {
        System.out.println("Software Resource:8GB");

    }
    public void desktopModel(){
        System.out.println("Desktop model:2021");
    }

    public static void main(String[] args) {
        Desktop d=new Desktop();
        d.desktopModel();
        d.hardwareResources();
        d.softwareResources();
    }
}

