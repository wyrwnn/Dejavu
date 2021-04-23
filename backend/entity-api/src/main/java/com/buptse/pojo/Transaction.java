package com.buptse.pojo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ASJA
 * @since 2021-04-23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer buyerId;

    private Integer sellerId;

    private Integer carId;

    private BigDecimal dealPrice;

    private LocalDateTime dealTime;

    private Integer saleId;


}
