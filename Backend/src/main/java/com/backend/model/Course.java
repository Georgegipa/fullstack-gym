package com.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_generator")
    @Column(name = "course_id",nullable = false)
    private int course_id;

    @Column(name = "course_name",nullable = false)
    private String course_name;

    @Column(name = "course_description",nullable = false)
    private String course_description;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "instructor_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Instructor instructor;

    public int getCourse_id()
    {
        return course_id;
    }

    public void setCourse_id(int course_id)
    {
        this.course_id = course_id;
    }

    public String getCourse_name()
    {
        return course_name;
    }

    public void setCourse_name(String course_name)
    {
        this.course_name = course_name;
    }

    public Instructor getInstructor()
    {
        return instructor;
    }

    public void setInstructor(Instructor instructor)
    {
        this.instructor = instructor;
    }

    public String getCourse_description()
    {
        return course_description;
    }

    public void setCourse_description(String course_description)
    {
        this.course_description = course_description;
    }
}