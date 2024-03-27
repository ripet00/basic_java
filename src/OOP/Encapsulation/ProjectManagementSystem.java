package OOP.Encapsulation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectManagementSystem {
    private static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        // add input to project manager
        Project_Manager projectManager = new Project_Manager();


        boolean addmoredata = true;

        while (addmoredata) {
            // input task
        System.out.print("Enter task name:");
        String taskName = scan.nextLine();
        System.out.print("Enter task description:");
        String taskDescription = scan.nextLine();
        Task task = new Task(taskName, taskDescription);
        projectManager.addTask(task);

        // input resource
        System.out.print("Enter resource name:");
        String resourceName = scan.nextLine();
        System.out.print("Enter resource description:");
        String resourceDescription = scan.nextLine();
        Resource resource = new Resource(resourceName, resourceDescription);
        projectManager.addResource(resource);
        // input team
        System.out.print("Enter team member name:");
        String teamMemberName = scan.nextLine();
        System.out.print("Enter team member role:");
        String teamMemberRole = scan.nextLine();
        Team_Member teamMember = new Team_Member(teamMemberName, teamMemberRole);
        projectManager.addTeam_Member(teamMember);

        System.out.print("Do you want to add more data (yes / no) ? ");
        String choice = scan.nextLine();
        addmoredata = choice.equalsIgnoreCase("Yes");
        }


        System.out.println("----------------");
        System.out.println("Display all the project");
        projectManager.displayAllTasks();
        projectManager.displayAllResources();
        projectManager.displayAllTeamMembers();

    }
}

// class  untuk mempresentasikan proyeknya
class Task{
    private String name;
    private String description;
    private boolean completed;

    // Konstruktor
    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.completed = false;
    }
    // Getter and setter  for atribut name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for atribut description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Method to display the task information
    public void displayInfo() {
        System.out.println("Task Name : " + name);
        System.out.println("Description : " + description);
        System.out.println("Completed : " + completed);
    }
}

// Presented the resource in the project
class Resource {
    private String name;
    private String description;

    // Konstruktor
    public Resource(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getter and setter for atribute name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // Getter and setter for atribute description
    public String getDescription() {
        return description;
    }

    public void setDescripiton(String description) {
        this.description = description;
    }
    
    // Method to display resource information
        public void displayInfo() {
            System.out.println("Resource Name : "+ name);
            System.out.println("Description : "+ description);
        }
}

class Team_Member {
    private String Team_member_name;
    private String Role;

    // Konstruktor
    public Team_Member(String Team_member_name, String Role) {
        this.Team_member_name = Team_member_name;
        this.Role = Role;
    }

    // Getter and setter for atribut name
    public String getName() {
        return Team_member_name;
    }

    public void setName(String Team_member_name) {
        this.Team_member_name = Team_member_name;
    }

    // Getter and setter for atribut role
    public String getRole() {
        return Team_member_name;
    }
    
    public void setRole(String Role) {
        this.Role = Role;
    }

    public void displayInfo() {
        System.out.println("Team Members : "+ Team_member_name);
        System.out.println("Role : "+ Role);
    }
    
}

// Class untuk mengelola proyek
class Project_Manager {
    private List<Task> tasks;
    private List<Resource> resources;
    private List<Team_Member> teamMembers;

    // Konstruktor
    public Project_Manager() {
        tasks = new ArrayList<>();
        resources = new ArrayList<>();
        teamMembers = new ArrayList<>();
    }

    // Method to added task to the project
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Method to added resource to the project
    public void addResource(Resource resource) {
        resources.add(resource);
    }

    // Method to added Team member to the project
    public void addTeam_Member(Team_Member teamMember) {
        teamMembers.add(teamMember);
    }

    public void displayAllTasks() {
        System.out.println("\nTask in the project : ");
        for (Task task : tasks) {
            task.displayInfo();
            System.out.println();
        }
    }

    public void displayAllResources() {
        System.out.println("Task in the project : ");
        for (Resource  resource : resources) {
            resource.displayInfo();
            System.out.println();
        }
    }

    public void displayAllTeamMembers() {
        System.out.println("Task in the project : ");
        for (Team_Member teamMember : teamMembers) {
            teamMember.displayInfo();
            System.out.println();
        }
    }
}
