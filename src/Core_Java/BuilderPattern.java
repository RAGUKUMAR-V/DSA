package Core_Java;

public class BuilderPattern {

    private String name;
    private String email;
    private String role;

    private BuilderPattern(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name;
        private String email;
        private String role;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }


    }



}
