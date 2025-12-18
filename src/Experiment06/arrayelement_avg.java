package Experiment06;
// printed the average of the given array elements using class and methods.
public class arrayelement_avg {
    double sum =0;
    double avg =0;
        
    void sum(){
    int arr[] = {20,30,25,25,16,60,-100};
    for(int i=0;i<arr.length;i++){
        sum = sum + arr[i];     
       // System.out.println(sum);
    }
        System.out.println(sum);  // printed sum of all the given array elements.
}
    void average(){
        avg = sum / 7;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        arrayelement_avg v = new arrayelement_avg();
        v.sum();
        v.average();

    }
    

}
