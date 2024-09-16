package oop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Square {
    @Getter @Setter
    private String color;
    @Getter @Setter
    private int vertices;
    @Getter @Setter
    private int length;

}
