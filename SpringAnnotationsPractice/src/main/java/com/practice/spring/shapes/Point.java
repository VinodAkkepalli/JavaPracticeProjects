package com.practice.spring.shapes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * <b>Description</b> : Point class representing a point on a plane
 * Data annotation of Project Lombok is used to avoid boilerplate code
 *
 * @author Vinod Akkepalli
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Point {
    private float x;
    private float y;
}
