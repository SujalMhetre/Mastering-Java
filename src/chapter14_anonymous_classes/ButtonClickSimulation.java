package chapter14_anonymous_classes;

public class ButtonClickSimulation {
    public static void main(String[] args) {

        ClickListener clickListener = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button clicked!");
            }
        };
        clickListener.onClick();
    }
}
