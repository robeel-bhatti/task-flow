const Configuration = {
  extends: ["@commitlint/config-conventional"],
  rules: {
    "subject-full-stop": [0, "always"],
  },
};

export default Configuration;
