import java.time.LocalDate;

public class MainMember {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(2007 , 01, 04);
        LocalDate applydate = LocalDate.now();
        Member member  = new Member("Joe Doe", 1, birthdate, applydate);

        System.out.println(member.getName() + " " + member.getId() + " " + member.getBirthdate() + " " + member.getApplydate() );

        member.setName("irisKo");
        member.setId(1905);
        member.setBirthdate(birthdate);
        member.setApplydate(applydate);
        System.out.println("Güncellendi " + member.getName() + " " + member.getId() + " " + member.getBirthdate() + " " + member.getApplydate() );


    }
}
