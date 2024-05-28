package spoj;

import java.util.Scanner;

class EISALARY2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numPeople = scn.nextInt();

        double totalOfficeHour = 0;
        double wageOfficeHour = 0;

        double totalOverTime = 0;
        double wageOvertime = 0;

        for(int k=0; k<numPeople; k++){

            double[] listHourWorking = new double[5];

            for(int i=0; i<5; i++){
                double hourWorking = scn.nextDouble();
                listHourWorking[i] = hourWorking;
            }

            double wageHourly = scn.nextDouble();

            double wageWeekly = 0;

            for(double n : listHourWorking){

                double overTime = 0;
                double officeHour = n;

                if(n > 8){
                    officeHour = 8;

                    overTime = n - 8;
                    n = 8 + (overTime * 1.5);

                    wageOvertime += overTime * wageHourly * 1.5;
                    totalOverTime += overTime;
                }

                wageWeekly += (n * wageHourly);

                wageOfficeHour += officeHour * wageHourly;
                totalOfficeHour += officeHour;
            }

            System.out.printf("%.2f\n", wageWeekly);
        }

        System.out.printf("%.2f\n", (wageOfficeHour == 0 || totalOfficeHour == 0 ? 0 : wageOfficeHour/totalOfficeHour));

        System.out.printf("%.2f\n", (wageOvertime==0 || totalOverTime==0 ? 0 : wageOvertime/totalOverTime));

        scn.close();
    }
}
