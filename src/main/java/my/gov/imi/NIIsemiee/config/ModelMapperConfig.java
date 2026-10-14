package my.gov.imi.NIIsemiee.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import my.gov.imi.NIIsemiee.Pengguna;
import my.gov.imi.NIIsemiee.PenggunaDto;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();
        
        // Tells ModelMapper to map the incoming plain text password into the entity's hashPassword target
        mapper.addMappings(new PropertyMap<PenggunaDto, Pengguna>() {
            @Override
            protected void configure() {
                map().setHashPassword(source.getPassword());
            }
        });
        
        return mapper;
    }
}