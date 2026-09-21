
class Hospital {
    
 
    public interface Doctor {
        void prescribeMedicine();
    }
}


public class p034 {

    @Override
    public void prescribeMedicine() {
        System.out.println("Doctor is prescribing medicine to the patient.");
    }

    public static void main(String[] args) {
      
        Hospital.Doctor doc = new NestedInterfaceDemo();
        doc.prescribeMedicine();
    }
}