package com.example.demo.model.constants;

public class messageList {
    public enum Messages {
        DEFAULT_MESSAGE("This is a placeholder String!!! Try replacing everything after '.com' in the url with 'com/hello?name=your_name' (replacing 'your_name' with YOUR name silly!)"),

        ;

        private final String text;

        Messages(final String text) {
            this.text = text;
        }

        @Override
        public String toString(){
            return text;
        }
    }
}
