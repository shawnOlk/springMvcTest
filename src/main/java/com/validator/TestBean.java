package com.validator;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by sunlei on 2017/5/8.
 */
@Data
public class TestBean {
    @AssertFalse(message = "assertFalse")
    private boolean assertFalseTest;

    @AssertTrue(message = "assertTrue")
    private Boolean AssertTrueTest;

    @DecimalMax(value = "100.02", message = "decimalMax")
    private Float decimalMaxTest;

    @DecimalMin(value = "100.02", message = "decimalMin")
    private Float decimalMinTest;

    @Digits(integer = 2, fraction = 2, message = "digits ")
    private BigDecimal digits;

    @NotNull(message = "not null")
    private String notNullTest;

    @Null(message = "null")
    private String nullTest;

    //检查给定的日期是否比现在晚.
    @Future(message = "future")
    private Date futureTest;

    @Past(message = "past")
    private Date pastTest;

    @Pattern(regexp="[A-Z]{3}",message = "pattern")
    private String patternTest;

    @Size(min = 2,max = 3,message = "size")
    private List<String> sizeListTest;


    @Valid
    private ValidTestBean validTestBean;

    @CheckCase(value = CaseMode.UPPER,message = "大写")
    private String name;

    @Length(min = 1,max = 9,message = "length")
    private String str;
    public static void main(String[] args) {
        TestBean testBean = new TestBean();
        testBean.setAssertFalseTest(true);
        testBean.setAssertTrueTest(false);
        testBean.setDecimalMaxTest(1100F);
        testBean.setDecimalMinTest(10f);
        testBean.setDigits(new BigDecimal(113.3234));
        testBean.setNotNullTest(null);
        testBean.setNullTest("test");
        testBean.setFutureTest(new Date());
        testBean.setPastTest(new Date());
        testBean.setPatternTest("SDW");
        List<String> tB=new ArrayList<String>();
        tB.add("12321");
        testBean.setSizeListTest(tB);

        testBean.setStr("1234567892");
        testBean.setName("dasf");


        ValidatorUtil.util(testBean);
    }
}
