package my.gov.imi.NIIsemiee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PenggunaAdminDto extends PenggunaDto {
    
    // Aligns perfectly with the int primary key type defined inside the Pengguna entity
    private int id;
}