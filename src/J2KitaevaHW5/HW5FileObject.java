package J2KitaevaHW5;

    public class HW5FileObject {
        private Integer value;
        private Integer valueFrom;
        private Integer valueTo;

        public HW5FileObject(Integer value, Integer valueFrom, Integer valueTo) {
            this.value = value;
            this.valueFrom = valueFrom;
            this.valueTo = valueTo;
        }

        public Integer getValue() {
            return value;
        }

        public Integer getValueFrom() {
            return valueFrom;
        }

        public Integer getValueTo() {
            return valueTo;
        }

    }

