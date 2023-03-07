class Con1{
Con1(){
System.out.println("hello");
}
Con1(int x,int y){
System.out.println("hello");
}

Con1(float x,int y){
System.out.println("hello");
}

Con1(int x,float y){
System.out.println("hello");
}

static public void main(String args[]){
Con1 al=new Con1();
Con1 a2=new Con1(1,2);
Con1 a3=new Con1(10.0f,5);
Con1 a4=new Con1(8,25.5f);



}
}