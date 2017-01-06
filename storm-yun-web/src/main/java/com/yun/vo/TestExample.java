package com.yun.vo;

import java.util.ArrayList;
import java.util.List;

public class TestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAaIsNull() {
            addCriterion("aa is null");
            return (Criteria) this;
        }

        public Criteria andAaIsNotNull() {
            addCriterion("aa is not null");
            return (Criteria) this;
        }

        public Criteria andAaEqualTo(String value) {
            addCriterion("aa =", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaNotEqualTo(String value) {
            addCriterion("aa <>", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaGreaterThan(String value) {
            addCriterion("aa >", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaGreaterThanOrEqualTo(String value) {
            addCriterion("aa >=", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaLessThan(String value) {
            addCriterion("aa <", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaLessThanOrEqualTo(String value) {
            addCriterion("aa <=", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaLike(String value) {
            addCriterion("aa like", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaNotLike(String value) {
            addCriterion("aa not like", value, "aa");
            return (Criteria) this;
        }

        public Criteria andAaIn(List<String> values) {
            addCriterion("aa in", values, "aa");
            return (Criteria) this;
        }

        public Criteria andAaNotIn(List<String> values) {
            addCriterion("aa not in", values, "aa");
            return (Criteria) this;
        }

        public Criteria andAaBetween(String value1, String value2) {
            addCriterion("aa between", value1, value2, "aa");
            return (Criteria) this;
        }

        public Criteria andAaNotBetween(String value1, String value2) {
            addCriterion("aa not between", value1, value2, "aa");
            return (Criteria) this;
        }

        public Criteria andSsIsNull() {
            addCriterion("ss is null");
            return (Criteria) this;
        }

        public Criteria andSsIsNotNull() {
            addCriterion("ss is not null");
            return (Criteria) this;
        }

        public Criteria andSsEqualTo(String value) {
            addCriterion("ss =", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsNotEqualTo(String value) {
            addCriterion("ss <>", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsGreaterThan(String value) {
            addCriterion("ss >", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsGreaterThanOrEqualTo(String value) {
            addCriterion("ss >=", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsLessThan(String value) {
            addCriterion("ss <", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsLessThanOrEqualTo(String value) {
            addCriterion("ss <=", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsLike(String value) {
            addCriterion("ss like", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsNotLike(String value) {
            addCriterion("ss not like", value, "ss");
            return (Criteria) this;
        }

        public Criteria andSsIn(List<String> values) {
            addCriterion("ss in", values, "ss");
            return (Criteria) this;
        }

        public Criteria andSsNotIn(List<String> values) {
            addCriterion("ss not in", values, "ss");
            return (Criteria) this;
        }

        public Criteria andSsBetween(String value1, String value2) {
            addCriterion("ss between", value1, value2, "ss");
            return (Criteria) this;
        }

        public Criteria andSsNotBetween(String value1, String value2) {
            addCriterion("ss not between", value1, value2, "ss");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}