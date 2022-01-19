package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    private Long id;

    @NotEmpty
    @Size(min = 10, max = 100)
    private String streetAddress;

    @NotEmpty
    @Size(min = 8, max = 9)
    private int zipCode;

    @NotEmpty
    @Size(min = 6, max = 25)
    private String city;

    @NotEmpty
    @Size(min = 5, max = 20)
    private String country;

}
