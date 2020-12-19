package com.yx.cdss.extract.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DictFrequenceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_frequence
     *
     *
     * @mbg.generated
     */
    public DictFrequenceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
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

        public Criteria andDfIdIsNull() {
            addCriterion("df_id is null");
            return (Criteria) this;
        }

        public Criteria andDfIdIsNotNull() {
            addCriterion("df_id is not null");
            return (Criteria) this;
        }

        public Criteria andDfIdEqualTo(Long value) {
            addCriterion("df_id =", value, "dfId");
            return (Criteria) this;
        }

        public Criteria andDfIdNotEqualTo(Long value) {
            addCriterion("df_id <>", value, "dfId");
            return (Criteria) this;
        }

        public Criteria andDfIdGreaterThan(Long value) {
            addCriterion("df_id >", value, "dfId");
            return (Criteria) this;
        }

        public Criteria andDfIdGreaterThanOrEqualTo(Long value) {
            addCriterion("df_id >=", value, "dfId");
            return (Criteria) this;
        }

        public Criteria andDfIdLessThan(Long value) {
            addCriterion("df_id <", value, "dfId");
            return (Criteria) this;
        }

        public Criteria andDfIdLessThanOrEqualTo(Long value) {
            addCriterion("df_id <=", value, "dfId");
            return (Criteria) this;
        }

        public Criteria andDfIdIn(List<Long> values) {
            addCriterion("df_id in", values, "dfId");
            return (Criteria) this;
        }

        public Criteria andDfIdNotIn(List<Long> values) {
            addCriterion("df_id not in", values, "dfId");
            return (Criteria) this;
        }

        public Criteria andDfIdBetween(Long value1, Long value2) {
            addCriterion("df_id between", value1, value2, "dfId");
            return (Criteria) this;
        }

        public Criteria andDfIdNotBetween(Long value1, Long value2) {
            addCriterion("df_id not between", value1, value2, "dfId");
            return (Criteria) this;
        }

        public Criteria andFreqNameIsNull() {
            addCriterion("freq_name is null");
            return (Criteria) this;
        }

        public Criteria andFreqNameIsNotNull() {
            addCriterion("freq_name is not null");
            return (Criteria) this;
        }

        public Criteria andFreqNameEqualTo(String value) {
            addCriterion("freq_name =", value, "freqName");
            return (Criteria) this;
        }

        public Criteria andFreqNameNotEqualTo(String value) {
            addCriterion("freq_name <>", value, "freqName");
            return (Criteria) this;
        }

        public Criteria andFreqNameGreaterThan(String value) {
            addCriterion("freq_name >", value, "freqName");
            return (Criteria) this;
        }

        public Criteria andFreqNameGreaterThanOrEqualTo(String value) {
            addCriterion("freq_name >=", value, "freqName");
            return (Criteria) this;
        }

        public Criteria andFreqNameLessThan(String value) {
            addCriterion("freq_name <", value, "freqName");
            return (Criteria) this;
        }

        public Criteria andFreqNameLessThanOrEqualTo(String value) {
            addCriterion("freq_name <=", value, "freqName");
            return (Criteria) this;
        }

        public Criteria andFreqNameLike(String value) {
            addCriterion("freq_name like", value, "freqName");
            return (Criteria) this;
        }

        public Criteria andFreqNameNotLike(String value) {
            addCriterion("freq_name not like", value, "freqName");
            return (Criteria) this;
        }

        public Criteria andFreqNameIn(List<String> values) {
            addCriterion("freq_name in", values, "freqName");
            return (Criteria) this;
        }

        public Criteria andFreqNameNotIn(List<String> values) {
            addCriterion("freq_name not in", values, "freqName");
            return (Criteria) this;
        }

        public Criteria andFreqNameBetween(String value1, String value2) {
            addCriterion("freq_name between", value1, value2, "freqName");
            return (Criteria) this;
        }

        public Criteria andFreqNameNotBetween(String value1, String value2) {
            addCriterion("freq_name not between", value1, value2, "freqName");
            return (Criteria) this;
        }

        public Criteria andFreqCodeIsNull() {
            addCriterion("freq_code is null");
            return (Criteria) this;
        }

        public Criteria andFreqCodeIsNotNull() {
            addCriterion("freq_code is not null");
            return (Criteria) this;
        }

        public Criteria andFreqCodeEqualTo(String value) {
            addCriterion("freq_code =", value, "freqCode");
            return (Criteria) this;
        }

        public Criteria andFreqCodeNotEqualTo(String value) {
            addCriterion("freq_code <>", value, "freqCode");
            return (Criteria) this;
        }

        public Criteria andFreqCodeGreaterThan(String value) {
            addCriterion("freq_code >", value, "freqCode");
            return (Criteria) this;
        }

        public Criteria andFreqCodeGreaterThanOrEqualTo(String value) {
            addCriterion("freq_code >=", value, "freqCode");
            return (Criteria) this;
        }

        public Criteria andFreqCodeLessThan(String value) {
            addCriterion("freq_code <", value, "freqCode");
            return (Criteria) this;
        }

        public Criteria andFreqCodeLessThanOrEqualTo(String value) {
            addCriterion("freq_code <=", value, "freqCode");
            return (Criteria) this;
        }

        public Criteria andFreqCodeLike(String value) {
            addCriterion("freq_code like", value, "freqCode");
            return (Criteria) this;
        }

        public Criteria andFreqCodeNotLike(String value) {
            addCriterion("freq_code not like", value, "freqCode");
            return (Criteria) this;
        }

        public Criteria andFreqCodeIn(List<String> values) {
            addCriterion("freq_code in", values, "freqCode");
            return (Criteria) this;
        }

        public Criteria andFreqCodeNotIn(List<String> values) {
            addCriterion("freq_code not in", values, "freqCode");
            return (Criteria) this;
        }

        public Criteria andFreqCodeBetween(String value1, String value2) {
            addCriterion("freq_code between", value1, value2, "freqCode");
            return (Criteria) this;
        }

        public Criteria andFreqCodeNotBetween(String value1, String value2) {
            addCriterion("freq_code not between", value1, value2, "freqCode");
            return (Criteria) this;
        }

        public Criteria andExtractTimeIsNull() {
            addCriterion("extract_time is null");
            return (Criteria) this;
        }

        public Criteria andExtractTimeIsNotNull() {
            addCriterion("extract_time is not null");
            return (Criteria) this;
        }

        public Criteria andExtractTimeEqualTo(Date value) {
            addCriterion("extract_time =", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeNotEqualTo(Date value) {
            addCriterion("extract_time <>", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeGreaterThan(Date value) {
            addCriterion("extract_time >", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("extract_time >=", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeLessThan(Date value) {
            addCriterion("extract_time <", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeLessThanOrEqualTo(Date value) {
            addCriterion("extract_time <=", value, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeIn(List<Date> values) {
            addCriterion("extract_time in", values, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeNotIn(List<Date> values) {
            addCriterion("extract_time not in", values, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeBetween(Date value1, Date value2) {
            addCriterion("extract_time between", value1, value2, "extractTime");
            return (Criteria) this;
        }

        public Criteria andExtractTimeNotBetween(Date value1, Date value2) {
            addCriterion("extract_time not between", value1, value2, "extractTime");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNull() {
            addCriterion("attribute1 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNotNull() {
            addCriterion("attribute1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute1EqualTo(String value) {
            addCriterion("attribute1 =", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotEqualTo(String value) {
            addCriterion("attribute1 <>", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThan(String value) {
            addCriterion("attribute1 >", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThanOrEqualTo(String value) {
            addCriterion("attribute1 >=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThan(String value) {
            addCriterion("attribute1 <", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThanOrEqualTo(String value) {
            addCriterion("attribute1 <=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Like(String value) {
            addCriterion("attribute1 like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotLike(String value) {
            addCriterion("attribute1 not like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1In(List<String> values) {
            addCriterion("attribute1 in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotIn(List<String> values) {
            addCriterion("attribute1 not in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Between(String value1, String value2) {
            addCriterion("attribute1 between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotBetween(String value1, String value2) {
            addCriterion("attribute1 not between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNull() {
            addCriterion("attribute2 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNotNull() {
            addCriterion("attribute2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute2EqualTo(String value) {
            addCriterion("attribute2 =", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotEqualTo(String value) {
            addCriterion("attribute2 <>", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThan(String value) {
            addCriterion("attribute2 >", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThanOrEqualTo(String value) {
            addCriterion("attribute2 >=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThan(String value) {
            addCriterion("attribute2 <", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThanOrEqualTo(String value) {
            addCriterion("attribute2 <=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Like(String value) {
            addCriterion("attribute2 like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotLike(String value) {
            addCriterion("attribute2 not like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2In(List<String> values) {
            addCriterion("attribute2 in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotIn(List<String> values) {
            addCriterion("attribute2 not in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Between(String value1, String value2) {
            addCriterion("attribute2 between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotBetween(String value1, String value2) {
            addCriterion("attribute2 not between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNull() {
            addCriterion("attribute3 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNotNull() {
            addCriterion("attribute3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute3EqualTo(String value) {
            addCriterion("attribute3 =", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotEqualTo(String value) {
            addCriterion("attribute3 <>", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThan(String value) {
            addCriterion("attribute3 >", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThanOrEqualTo(String value) {
            addCriterion("attribute3 >=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThan(String value) {
            addCriterion("attribute3 <", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThanOrEqualTo(String value) {
            addCriterion("attribute3 <=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Like(String value) {
            addCriterion("attribute3 like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotLike(String value) {
            addCriterion("attribute3 not like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3In(List<String> values) {
            addCriterion("attribute3 in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotIn(List<String> values) {
            addCriterion("attribute3 not in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Between(String value1, String value2) {
            addCriterion("attribute3 between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotBetween(String value1, String value2) {
            addCriterion("attribute3 not between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNull() {
            addCriterion("attribute4 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNotNull() {
            addCriterion("attribute4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute4EqualTo(String value) {
            addCriterion("attribute4 =", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotEqualTo(String value) {
            addCriterion("attribute4 <>", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThan(String value) {
            addCriterion("attribute4 >", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThanOrEqualTo(String value) {
            addCriterion("attribute4 >=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThan(String value) {
            addCriterion("attribute4 <", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThanOrEqualTo(String value) {
            addCriterion("attribute4 <=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Like(String value) {
            addCriterion("attribute4 like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotLike(String value) {
            addCriterion("attribute4 not like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4In(List<String> values) {
            addCriterion("attribute4 in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotIn(List<String> values) {
            addCriterion("attribute4 not in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Between(String value1, String value2) {
            addCriterion("attribute4 between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotBetween(String value1, String value2) {
            addCriterion("attribute4 not between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNull() {
            addCriterion("attribute5 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNotNull() {
            addCriterion("attribute5 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute5EqualTo(String value) {
            addCriterion("attribute5 =", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotEqualTo(String value) {
            addCriterion("attribute5 <>", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThan(String value) {
            addCriterion("attribute5 >", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThanOrEqualTo(String value) {
            addCriterion("attribute5 >=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThan(String value) {
            addCriterion("attribute5 <", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThanOrEqualTo(String value) {
            addCriterion("attribute5 <=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Like(String value) {
            addCriterion("attribute5 like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotLike(String value) {
            addCriterion("attribute5 not like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5In(List<String> values) {
            addCriterion("attribute5 in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotIn(List<String> values) {
            addCriterion("attribute5 not in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Between(String value1, String value2) {
            addCriterion("attribute5 between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotBetween(String value1, String value2) {
            addCriterion("attribute5 not between", value1, value2, "attribute5");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dict_frequence
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dict_frequence
     *
     * @mbg.generated
     */
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