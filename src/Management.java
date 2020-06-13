

public class Management {
    public static void main(String[] args) {
        Manager Director=new Manager(111, "Arman Zhumaliev", "Uly Dala street", "Company Director", "Higher", "Management");
        Director.setBonus(2000);
        Director.setPenalty(1000);
        Director.setDoingDuration(14);
        Director.setSalary(3000);
        BackendDeveloper Junior = new BackendDeveloper(123, "Azamat Sabyrzhan", "Independence street 14","Developer",
                "Lower", "Production");
        Junior.setSalary(500);
        Junior.setDoTime(16);
        FrontendDeveloper Designer = new FrontendDeveloper(1231, "Aylia Sultan", "Kabanbay batyr street 34", "Developer","Medium", "Production");
        System.out.println("IT company staff Info: ");
        Designer.setDoTime(10);
        Designer.setSalary(1000);
        Director.EmpInfo();
        Director.ManagerInfo();
        Designer.EmpInfo();
        Designer.FrontendInfo();
        Junior.EmpInfo();
        Junior. BackendInfo();
        System.out.println("IT company Project Info: ");
        System.out.println("Project Name: Game production");
        System.out.println("With this project works "+Designer.getDepartment()+" department");
        System.out.println(Director.getName()+ " manages this project");
        System.out.println("On project works: "+Director.getName()+", "+Designer.getName()+", "+Junior.getName());
        int cost=Director.gettingSalary()+Junior.gettingSalary()+Designer.gettingSalary()+3000;
        System.out.println("Project cost: "+cost+"$");
        System.out.println("Project expected Realization time: "+Designer.get_doing_duration());
        if(Designer.getDoTime()==Designer.get_doing_duration()&&Junior.getDoTime()==Junior.get_doing_duration()){
            System.out.println("Project finished in on time.");
        }
        else if(Designer.getDoTime()<Designer.get_doing_duration()&&Junior.getDoTime()==Junior.get_doing_duration()){
            int day1=Designer.get_doing_duration()-Designer.getDoTime();
            int day2=Junior.get_doing_duration()-Junior.getDoTime();
            System.out.println("Project finished "+Math.max(day1, day2)+ " day early.");
        }
        else if(Designer.getDoTime()>Designer.get_doing_duration()||Junior.getDoTime()>Junior.get_doing_duration()){
            int day1=Designer.getDoTime()-Designer.get_doing_duration();
            int day2=Junior.getDoTime()-Junior.get_doing_duration();
            System.out.println("Project finished "+Math.max(day1, day2)+" day later.");
        }
    }

}