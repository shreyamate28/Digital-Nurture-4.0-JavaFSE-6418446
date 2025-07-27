import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then(response => response.json())
      .then(data => {
        const postObjects = data.map(post => new Post(post.id, post.title, post.body));
        this.setState({ posts: postObjects });
      })
      .catch(error => {
        console.error("Error loading posts:", error);
        this.setState({ hasError: true });
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("An error occurred: " + error);
    this.setState({ hasError: true });
  }

 render() {
  if (this.state.hasError) {
    return <h2>Something went wrong while loading posts.</h2>;
  }

  return (
    <div style={{ padding: "20px", textAlign: "left" }}>
      <h1>Posts</h1>
      {this.state.posts.map(post => (
        <div key={post.id} style={{ marginBottom: "20px" }}>
          <h3>{post.id}. {post.title}</h3>
          <p>{post.body}</p>
        </div>
      ))}
    </div>
  );
}


}

export default Posts;
