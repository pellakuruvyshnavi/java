package day14;

public class HandsOnBuffBuilder {
    public static void main(String[] args) {
        StringBuilder builder =  new StringBuilder();
        StringBuffer buffer = new StringBuffer();
        builder.append(7.8);builder.append("Spring Boot");
        builder.append(true);builder.append(98);
        System.out.println(builder);
        builder.insert(2,"javalin");
        System.out.println(builder);
        System.out.println(builder.substring(5,11));
        builder.setCharAt(4,'z');
        System.out.println(builder);
        builder.delete(2, 10);
        System.out.println(builder);
        buffer.append(builder);
        System.out.println(buffer.toString());
    }
}
