package Test;

public class Test {
    private final String name;

    public Test(String name) {
        this.name = name;
    }

    public enum Color {
        RED("红"), WHITE("白"), BLACK("黑");
        private final String name;

        Color(String name) {
            this.name = name;
        }

        public void write() {
            System.out.println(this.name);
        }
    }

    public class InTest {
        private final String name;

        public InTest(String name) {
            this.name = name;
        }

        public void write() {
            System.out.println(Test.this.name);
        }
    }

    public void write(InTest inTest) {
        System.out.println(this.name);
    }
}
