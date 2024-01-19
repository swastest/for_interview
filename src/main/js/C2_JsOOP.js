function User() { }

User.prototype = { admin: false };

const user = new User();

User.prototype = { admin: true };

alert(user.admin); // false
