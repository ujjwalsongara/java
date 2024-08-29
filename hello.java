class hello{
  public static void main(String[] args) {
    int a[] = new int[5];

    a[0]=10;
    a[1]=200;
    a[2]=309;
    a[3]=3454;
    a[4]=44;
    System.out.println("Original Array:");
    for(int i=0;i<a.length;i++)
    System.out.println(a[i]);

    System.out.println("reverse order Array:");
    for(int i=a.length-1;i>=0;i--)
    System.out.println(a[i]);
  }
}
