class CMMD{
    public static void main(String[] args){
        System.out.println("number of argument "+args.length);
        for(int i=0;i<args.length;i++){
            System.out.println("arg  "+i + " :"+args[i]);
        }
    }
}