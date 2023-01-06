package 多态;

public class Manager {
    public static void main(String[] args) {
        IWorker worker=new Worker();
        worker.work();
        worker.lunch();
        IWorker superworker=new SuperWorker();
        superworker.work();
        superworker.lunch();
    }
}
