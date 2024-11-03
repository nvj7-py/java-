class employee{
    int id;
    String name;
    double salary;
    public employee(int i,String n,double s){
        id=i;
        name=n;
        salary=s;
    }
    void display(){
        System.out.println(id+""+name+""+salary);
    }
    public void raiseSalary(double percent){
        if(percent>0){
            salary+=salary*(percent/100);
            System.out.println("Salary raised by"+percent+"% for employee"+name+"New salary:$"+salary);
        }else{
            System.out.println("*************.Salary remaain unchanged for employee"+name);
        }
    }
    public static void main(String[] args) {
        employee employee1=new employee(1,"John Doe", 50000.00);
        employee employee2=new employee(2,"Mary", 45000.00);
        employee1.display();
        employee2.display();
        employee1.raiseSalary(10);
        employee2.raiseSalary(5);
        employee1.display();
        employee2.display();
    }}