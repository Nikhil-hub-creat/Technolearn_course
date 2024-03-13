public class armstrong_number {

    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        int rem,rev,temp,sum,cube;
        sum=0;
        cube=0;
        rev=0;
        temp = num;
        while (temp!=0) {
            rem = temp%10;
            cube = rem*rem*rem;
            sum=sum+cube;
            temp=temp/10;
            
        }
        if(sum==num){
            System.out.println("armstrong number");
        }else{
            System.out.println("not an armstrong number");
        }
    }
}