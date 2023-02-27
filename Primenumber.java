package controlstatement;
public class Primenumber {
public static void main (String[] args) {
int n,i,j,isprime;
System.out.println(" prime number 1 to 150 are:");
for(i=2;i<=150;i++) { //first for loop
isprime=0;
for(j=2;j<i/2;j++) {
if(i%j==0) {
isprime=1;
break;
}}
if(isprime==0) {
System.out.println(i + " ");
}}}}