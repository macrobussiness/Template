package com.zeroten.javales001.innerclass;

public class OuterClass {
    private Integer index;
    private String name;

    public OuterClass(int index, String name) {
        this.index = index;
        this.name = name;
    }

    // 内部类：定义在其他类中的类，称为内部类
    public class InnerClass {
        private String name;

        public InnerClass(String name) {
            this.name = name;
        }

        public class InnerClass2 {
            public class InnerClass3 {
            }
        }

        public void printInfo() {
//            StringBuilder tmp = new StringBuilder();
//            tmp.append("外围类index=");
//            tmp.append(OuterClass.this.index);
//            tmp.append(",外围类name=");
//            tmp.append(OuterClass.this.name);
//            System.out.println(tmp.toString());

            // 使用局部内部类实现打印
            String name = "方法";
//            class PrintClass {
//                void print() {
//                    StringBuilder tmp = new StringBuilder();
//                    tmp.append("外围类index=");
//                    tmp.append(OuterClass.this.index);
//                    tmp.append(",外围类name=");
//                    tmp.append(OuterClass.this.name);
//                    System.out.println(tmp.toString());
//                }
//            }
//            new PrintClass().print();

            // 使用匿名内部类来实现打印
            class PrintInterfaceImpl implements PrintInterface {
                @Override
                public void print() {

                }
            }
            new PrintInterfaceImpl().print();

            // 使用匿名内部类来实现打印 - 实现接口
//            PrintInterface var1 = new PrintInterface() {
//                @Override
//                public void print() {
//                    StringBuilder tmp = new StringBuilder();
//                    tmp.append("外围类index=");
//                    tmp.append(OuterClass.this.index);
//                    tmp.append(",外围类name=");
//                    tmp.append(OuterClass.this.name);
//                    System.out.println(tmp.toString());
//                }
//            };
//            var1.print();

            // 使用匿名内部类来实现打印 - 实现抽象类
//            class PrintAbstractImpl extends PrintAbstract {
//                @Override
//                void print() {
//                }
//            }
//            new PrintAbstractImpl().print();

//            new PrintAbstract() {
//                @Override
//                void print() {
//                    StringBuilder tmp = new StringBuilder();
//                    tmp.append("外围类index=");
//                    tmp.append(OuterClass.this.index);
//                    tmp.append(",外围类name=");
//                    tmp.append(OuterClass.this.name);
//                    System.out.println(tmp.toString());
//                }
//            }.print();

            // 使用匿名内部类来实现打印 - 类
//            class PrintClassNew extends PrintClass {
//            }
//            new PrintClassNew().print();

//            new PrintClass("类名") {
//                @Override
//                public void print() {
//                    StringBuilder tmp = new StringBuilder();
//                    tmp.append("外围类index=");
//                    tmp.append(OuterClass.this.index);
//                    tmp.append(",外围类name=");
//                    tmp.append(super.name);
//                    System.out.println(tmp.toString());
//                }
//            }.print();
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(1, "我是外部类");

        OuterClass.InnerClass innerClass = outerClass.new InnerClass("内部类");
        innerClass.printInfo();
    }
}
