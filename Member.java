import java.time.LocalDate;

public class Member {
    private String name;
    private int id;
    private LocalDate birthdate;
    private LocalDate applydate;

    public Member(String name, int id, LocalDate birthdate, LocalDate applydate) {
        this.name = name;
        this.id = id;
        this.birthdate = birthdate;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public LocalDate getBirthdate(){
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate){
        this.birthdate = birthdate;
    }
    public LocalDate getApplydate(){
        return applydate;
    }
    public void setApplydate(LocalDate applydate){
        this.applydate = applydate;
    }
}
