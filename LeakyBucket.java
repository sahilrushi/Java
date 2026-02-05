import java.util.Scanner;
public class LeakyBucket
{
public static void main(String[] args)
{
int i;
int a[] = new int[20];
int buck_rem = 0, buck_cap = 4, rate = 3, sent, recv = 0;
// Use try-with-resources to avoid resource leak warning
Scanner in = new Scanner(System.in);
System.out.print("Enter the number of packets: ");
int n = in.nextInt();
System.out.print("Enter the packets: ");

for (i = 1; i <= n; i++)
{
a[i] = in.nextInt();
}
System.out.println("Clock \t Packet Size \t Accept \t Sent \t Remaining");


for (i = 1; i <= n; i++)
{
if (a[i] != 0)
{
if (buck_rem + a[i] > buck_cap)
recv = -1;
else
{
recv = a[i];//always recive while incoming water
buck_rem += a[i];
}
}



if (buck_rem != 0)
{
if (buck_rem < rate)
{
sent = buck_rem;//always sent while dropping
buck_rem = 0;
}
else
{
sent = rate;
buck_rem -= rate;
}
}
else
sent = 0;


if (recv == -1)
System.out.println(i + "\t\t" + a[i] + "\t Dropped \t" + sent + "\t" + buck_rem);
else
System.out.println(i + "\t\t" + a[i] + "\t\t" + recv + "\t" + sent + "\t" + buck_rem);
}
} // Scanner automatically closed here
}
