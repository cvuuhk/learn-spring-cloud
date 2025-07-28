package com.cuishuhao.base;

import net.sf.jsqlparser.expression.Alias;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.Function;
import net.sf.jsqlparser.expression.operators.arithmetic.Division;
import net.sf.jsqlparser.expression.operators.relational.EqualsTo;
import net.sf.jsqlparser.expression.operators.relational.ExpressionList;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.select.*;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(tt());
    }

    public static String tt() {
        PlainSelect statement = new PlainSelect();

        // select 部分
        Column totalAge = new Column("total_age");
        Column totalCount = new Column("total_count");
        Division division = new Division().withLeftExpression(totalAge).withRightExpression(totalCount);
        SelectExpressionItem selectItem = new SelectExpressionItem().withExpression(division).withAlias(new Alias("avg_age"));
        statement.addSelectItems(selectItem);

        // 第一个子查询部分
        SubSelect sub1 = getSubSelect1();
        statement.setFromItem(sub1);

        // 第二个子查询部分
        SubSelect sub2 = getSubSelect2();

        // 拼接两个子查询
        Expression onExpression = new EqualsTo(new Column("it1.major"), new Column("it2.major"));
        Join join = new Join().withInner(true);
        join.setRightItem(sub2);
        join.addOnExpression(onExpression);

        return statement.addJoins(join).toString();
    }

    public static SubSelect getSubSelect1() {
        PlainSelect select = new PlainSelect();

        Column age = new Column("age");
        Function functionSum = new Function().withName("sum").withParameters(new ExpressionList(age));
        SelectItem sum = new SelectExpressionItem(functionSum).withAlias(new Alias("total_age"));
        select.addSelectItems(sum);

        select.setFromItem(new Table("t_student"));

        return new SubSelect().withAlias(new Alias("it1")).withSelectBody(select);
    }

    public static SubSelect getSubSelect2() {
        PlainSelect select = new PlainSelect();

        Column id = new Column("id");
        Function functionSum = new Function().withName("count").withParameters(new ExpressionList(id));
        SelectItem count = new SelectExpressionItem(functionSum).withAlias(new Alias("total_count"));
        select.addSelectItems(count);

        select.setFromItem(new Table("t_student"));

        return new SubSelect().withAlias(new Alias("it2")).withSelectBody(select);
    }
}