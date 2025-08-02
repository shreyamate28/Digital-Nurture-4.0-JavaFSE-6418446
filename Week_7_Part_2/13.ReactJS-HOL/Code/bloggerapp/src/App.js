import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import { books } from './data/books';
import { blogs } from './data/blogs';
import { courses } from './data/courses';
import './App.css';

function App() {
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);
  const [showCourses, setShowCourses] = useState(true);

  return (
    <div>
      <div style={{ display: 'flex', justifyContent: 'space-around' }}>
        {showBooks && <BookDetails books={books} />}
        {showBlogs ? <BlogDetails blogs={blogs} /> : <p>No blogs to show.</p>}
        {showCourses && <CourseDetails courses={courses} />}
      </div>
    </div>
  );
}

export default App;
