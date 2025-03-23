class UnaryDemo{
public static void main(String[] args) {
//pre Increment
int a = 10;
System.out.println("Pre in" + (++a + a));
//post Increment
a = 10;
System.out.println("Post in" + (a+++a));
a = 10;
System.out.println("Sum is: "+Integer.sum(++a,a));
// pre Decrement
a = 10;
System.out.println("Pre de" + (--a + a));
//post Decrement
a = 10;
System.out.println("Post de" + (a--+a));
a = 10;
System.out.println("Sum is: "+Integer.sum(--a,a));

}
}