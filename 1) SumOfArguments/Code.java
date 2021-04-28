
// 1.) To find the sum of any integers entered as command line arguments.

  class SumOfArguments{
        public static void main(String [] args){
            int n= args.length;
            int sum=0;
            for(int i=0 ; i<n ; i++){
                sum+=Integer.parseInt(args[i]);
            }
            System.out.print("The sum of entered arguments is : "+sum);
        }
 }
