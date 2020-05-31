package space.banka.alyona.nauka.schedule.entrypoints.webui.formobjects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.convert.JodaTimeConverters;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeForm {
    String name;
    String surname;
    LocalDate birthDate;
    String position;
    boolean remoteWork;
    String address;
    String department;
}