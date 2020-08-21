import java.util.Scanner;

public class SubsetSum {
    public static int[] pairSubSetSum(int[] s, int x)
    {
        int[] answer = new int[2];
        for(int i = 0 ; i< s.length-1;i++)
        {
            for(int j = i +1;j<s.length;j++)
            {
                if(s[i]+s[j]==x)
                {
                    answer[0] = s[i];
                    answer[1] = s[j];
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Enter a sorted array of numbers:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] st = s.split(",");
        int[] arr = new int[st.length];

        for(int i =0 ; i<st.length;i++)
        {
            st[i] = st[i].replaceAll("\\s", "");
            arr[i] = Integer.parseInt(st[i]);
        }

        int target = 999;
        while (target>0) {
            System.out.println("Enter a target number:");
            target = sc.nextInt();

            if (target > 0) {
                int[] answer = pairSubSetSum(arr, target);
                if(answer[0]==0 && answer[1]==0)
                {
                    System.out.println("There is no subset for number "+target);
                }
                else
                {
                    System.out.println(target + " = ["+answer[0]+","+answer[1]+"]");
                }
            } else {
                System.out.println("Goodbye!");
            }
        }
    }
}
