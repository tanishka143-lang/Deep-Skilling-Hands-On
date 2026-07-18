import React from "react";
import CourseDetails from "./CourseDetails";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";

function App() {
  const show = true;

  return (
    <div
      style={{
        display: "flex",
        justifyContent: "space-around",
        marginTop: "50px",
      }}
    >
      {}
      {show ? <CourseDetails /> : null}

      {}
      {show && <BookDetails />}

      {}
      <BlogDetails />
    </div>
  );
}

export default App;
